package drawing.shapes;

public record Line(int[] start, int[] end) {

    public char[] toJPEG() {
        // Pretend this works.
        return new char[0];
    }

    public char[] toPNG() {
        // Pretend this works.
        return new char[0];
    }
}
