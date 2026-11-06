package advsoft.flyweight;

import java.util.NoSuchElementException;

public class SizeFactory extends FlyweightFactory<Size> {
    private static SizeFactory instance = new SizeFactory();

    private SizeFactory() {}

    public static SizeFactory getInstance() {
        return SizeFactory.instance;
    }

    public Size getSize(int size) {
        try {
            return get((Size s) -> s.getSize() == size);
        }
        catch (NoSuchElementException e) {
            Size newSize = new Size(size);
            pool.add(newSize);
            return newSize;
        }
    }

    public void printPool() {
        System.out.println("===== Size Pool =====");
        for (Size s : pool) {
            System.out.println(s.getSize());
        }
    }
}
