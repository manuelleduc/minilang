package fr.inria.diverse.minilang.benchmark;

import fr.inria.diverse.minilang.algebra.benchmark.ObjectAlgebraScaling;
import fr.inria.diverse.minilang.embeded.benchmark.EmbededScaling;
import fr.inria.diverse.minilang.k3.benchmark.K3Scaling;
import fr.inria.diverse.minilang.visitor.benchmark.VisitorScaling;

public class Scaling {
	public static void main(String[] args) {
		final EmbededScaling embededScaling = new EmbededScaling();
		final K3Scaling k3Scaling = new K3Scaling();
		final VisitorScaling visitorScaling = new VisitorScaling();
		final ObjectAlgebraScaling objectAlgebraScaling = new ObjectAlgebraScaling();

		visitorScaling.setup();
		embededScaling.setup();
		k3Scaling.setup();
		objectAlgebraScaling.setup();

		for (int limit = 1; limit < 11; limit++) {
			for (int iteration = 0; iteration < 50; iteration++) {
				embededScaling.loop(limit, iteration);
				k3Scaling.loop(limit, iteration);
				visitorScaling.loop(limit, iteration);
				objectAlgebraScaling.loop(limit, iteration);
			}
		}
	}
}
