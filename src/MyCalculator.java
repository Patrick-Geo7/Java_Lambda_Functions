
public class MyCalculator extends Calculator<Double, Integer>{

    class DoubleToIntegerConverter implements Converter<Double, Integer> {
        @Override public Integer convertTo(Double v) { return v.intValue(); }
    }

    class IntegerAdder implements Processor<Integer> {
        @Override public Integer process(Integer v1, Integer v2) { return v1 + v2; }
    }
    class IntegerSubtractor implements Processor<Integer>{
        @Override public Integer process(Integer v1, Integer v2){return v1-v2;}
    }
    class IntegerMultiplier implements Processor<Integer>{
        @Override public Integer process(Integer v1, Integer v2){return v1*v2;}
    }
    private DoubleToIntegerConverter myConverter = new DoubleToIntegerConverter();
    private final OutputPrinter<Integer> printer;
    public MyCalculator(OutputPrinter<Integer> printer) {
        this.printer = printer;
    }
    public void add(InputProvider<Double> input1, InputProvider<Double> input2) {
        process(input1, input2, myConverter, new IntegerAdder(), printer);
    }
    public void subtract(InputProvider<Double> input1, InputProvider<Double> input2) {
        process(input1, input2, myConverter, new IntegerSubtractor(), printer);
    }
    public void multiply(InputProvider<Double> input1, InputProvider<Double> input2) {
        process(input1, input2, myConverter, new IntegerMultiplier(), printer);
    }
}

