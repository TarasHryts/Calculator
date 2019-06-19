public class MathOperations{
    private int result;
    //mathematical action implementation
    public MathOperations(InputData example){
        switch (example.getOperation()){
            case OperationType.OPER_SUM: {
                this.result = example.getNum1() + example.getNum2();
                break;
            }
            case OperationType.OPER_DIF: {
                this.result = example.getNum1() - example.getNum2();
                break;
            }
            case OperationType.OPER_MUL: {
                this.result = example.getNum1() * example.getNum2();
                break;
            }
            case OperationType.OPER_DIV: {
                this.result = example.getNum1() / example.getNum2();
                break;
            }
        }

    }
    public int getResult() {
        return result;
    }
}
