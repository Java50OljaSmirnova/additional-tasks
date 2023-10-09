package telran.additional;
import java.util.ArrayList;
import java.util.List;
import java.util.function.ToLongFunction;
import java.util.stream.Collector;
import java.util.stream.Collector.Characteristics;

public class MaxRatedWinnersCollector {
	
	
	private MaxRatedWinnersCollector() {} // hidden constructor

	
	public static <T> Collector<T, ?, List<T>> of(ToLongFunction<T> rater) {
		return Collector.of(
				() -> new RateAccumulator<T>(rater), 
				RateAccumulator::accumulate, 
				RateAccumulator::combine, 
				RateAccumulator::getWinnersList, 
				Characteristics.UNORDERED);
	}

	private static class RateAccumulator<T> {
		ToLongFunction<T> rater;
		List<T> winners = new ArrayList<>();
		Long currentMax = Long.MIN_VALUE;
		
		public RateAccumulator(ToLongFunction<T> rater) {
			this.rater = rater;
			
		}

		public List<T> getWinnersList() {
			
			return winners;
		}

		public void accumulate(T value) {
			Long rate = rater.applyAsLong(value);
			
			if(rate > currentMax) {
				currentMax = rate;
				winners.clear();
			}
			if(rate == currentMax) {
				winners.add(value);
			}
		}

		public RateAccumulator<T> combine(RateAccumulator<T> other) {
			if(this.currentMax < other.currentMax) {
				return other;
			} else if (this.currentMax == other.currentMax) {
				this.winners.addAll(other.winners);
			}
			
			return this;
		}
	}
}
