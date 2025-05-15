package drawing.writing;

import java.io.IOException;
import java.io.Writer;

public class JPEGWriter extends Writer {
    private final String filename;
    private boolean closed = false;

    public JPEGWriter(String filename) {
        this.filename = filename;
        System.out.println("JPEGWriter created for file: " + filename);
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        if (closed) throw new IOException("Writer is closed");
        System.out.print(new String(cbuf, off, len));
    }

    @Override
    public void flush() throws IOException {
        if (closed) throw new IOException("Writer is closed");
        System.out.println("\nJPEGWriter flushed");
    }

    @Override
    public void close() throws IOException {
        closed = true;
        System.out.println("JPEGWriter closed for file: " + filename);
    }
}
