public class Exceptions extends RuntimeException {

    public static double sqrt(double x) {
        if(x < 0){
            throw new IllegalArgumentException("Expected non-negative number, got " + x);
        }
        return Math.sqrt(x);
    }

    public static String getCallerClassAndMethodName() {
        StackTraceElement trace[] = new Throwable().getStackTrace();

        if (trace.length <= 2)
        {
            return null;
        }
        else {
            String message = trace[2].toString().replace(".", "#");
            int index = message.indexOf("(");
            return message.substring(0, index);
        }
    }

    public static void another() {
        System.out.println(getCallerClassAndMethodName());
        getCallerClassAndMethodName();
    }

    public static void main(String[] args) throws Exception {
        System.out.println(getCallerClassAndMethodName());
        another();
    }}
