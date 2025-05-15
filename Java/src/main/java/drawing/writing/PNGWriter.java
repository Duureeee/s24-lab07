package drawing.writing;

import java.io.IOException;
import java.io.Writer;

public class PNGWriter extends Writer {
    private final String filename;
    private boolean closed = false;

    public PNGWriter(String filename) {
        this.filename = filename;
        System.out.println("PNGWriter created for file: " + filename);
    }

    @Override
    public void write(char[] cbuf, int off, int len) throws IOException {
        if (closed) throw new IOException("Writer is closed");
        System.out.print(new String(cbuf, off, len));
    }

    @Override
    public void flush() throws IOException {
        if (closed) throw new IOException("Writer is closed");
        System.out.println("\nPNGWriter flushed");
    }

    @Override
    public void close() throws IOException {
        closed = true;
        System.out.println("PNGWriter closed for file: " + filename);
    }
}
