public class Calculator<I, O> {
    protected void process(InputProvider<I> firstInput, InputProvider<I> secondInput,
                           Converter<I, O> converter,
                           Processor<O> p,
                           OutputPrinter<O> output) {
        I x = firstInput.getInput();
        I y = secondInput.getInput();
        O valueX = converter.convertTo(x);
        O valueY = converter.convertTo(y);
        O result = p.process(valueX, valueY);
        output.print(result);
    }
}

