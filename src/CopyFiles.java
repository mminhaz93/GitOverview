public class CopyFiles {
    /*
     inputStream -The InputStream is used to read data from a source.
     OutputStream - The OutputStream is used for writing data to a destination
     Byte Stream - are a sequence of bytes used by programs to input and output information.
     Character Stream - are used to perform input and output for 16-bit unicode.
     standard input--referenced by System.in
Used for program input, typically reads input entered by the user.

standard output--referenced by System.out
Used for program output, typically displays information to the user.

standard error--referenced by System.err
Used to display error messages to the user.

FileInputStream
This stream is used for reading data from the files. Objects can be created using the keyword new and there are several types of constructors available
public void close() throws IOException{}
This method closes the file output stream. Releases any system resources associated with the file. Throws an IOException.
protected void finalize()throws IOException {}
This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream. Throws an IOException.
public int read(int r)throws IOException{}
This method reads the specified byte of data from the InputStream. Returns an int. Returns the next byte of data and -1 will be returned if it's the end of the file.
public int read(byte[] r) throws IOException{}
This method reads r.length bytes from the input stream into an array. Returns the total number of bytes read. If it is the end of the file, -1 will be returned.
public int available() throws IOException{}
gives the number of bytes that can be read from this file input stream. Returns an int.

FileOutputStream is used to create a file and write data into it.
public void close() throws IOException{}
This method closes the file output stream. Releases any system resources associated with the file. Throws an IOException.
protected void finalize()throws IOException {}
This method cleans up the connection to the file. Ensures that the close method of this file output stream is called when there are no more references to this stream. Throws an IOException.
public void write(byte[] w)




     */

}


