package base;

public class WrapperExample {

	public static void main(String[] args) {
        int primitiveValue = 10;

        // Autoboxing: Converting primitive int to Integer object
        Integer wrapperObject = primitiveValue;

        // Unboxing: Converting Integer object back to primitive int
        int unboxedValue = wrapperObject;

        System.out.println("Primitive value: " + primitiveValue);
        System.out.println("Wrapper object: " + wrapperObject);
        System.out.println("Unboxed value: " + unboxedValue);
    }
}