import java.util.Objects;
import java.util.function.Consumer;
import java.util.function.Predicate;

public final class Pair<T1, T2> {

    /**
     * If non-null, the value; if null, indicates no value is present
     */
    private final T1 left;
    private final T2 right;


    private Pair(T1 left, T2 right) {
        this.left = left;
        this.right = right;
    }


    public static <T1, T2> Pair<T1, T2> of(T1 left, T2 right) {
        return new Pair<>(left, right);
    }

    public T1 getLeft() {
        /*if (left == null) {
            throw new NoSuchElementException("No value present");
        }*/
        return left;
    }

    public T2 getRight() {
        /*if (left == null) {
            throw new NoSuchElementException("No value present");
        }*/
        return right;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Pair)) {
            return false;
        }

        Pair<?, ?> other = (Pair<?, ?>) obj;
        return Objects.equals(getLeft(), other.getLeft()) && Objects.equals(getRight(), other.getRight());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getLeft(), getRight());
    }
}