import org.apache.beam.sdk.Pipeline;
import org.apache.beam.sdk.io.TextIO;
import org.apache.beam.sdk.options.PipelineOptions;
import org.apache.beam.sdk.options.PipelineOptionsFactory;
import org.apache.beam.sdk.transforms.Create;

import java.util.Arrays;
import java.util.List;

public class ApacheBeamMain {

    public static void main(String[] args) {
        PipelineOptions pipelineOptions = PipelineOptionsFactory.create();
        Pipeline pipeline = Pipeline.create(pipelineOptions);
        final List<String> input = Arrays.asList("List","Set","Map","Queue");
        pipeline.apply(Create.of(input)).apply(TextIO.write().to("F:\\beam_sample_app\\output\\Collections").withSuffix(".txt"));


        pipeline.run().waitUntilFinish();
    }
}
