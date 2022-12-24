public class InputDecorator implements File_interface {

    private final File_interface file_instance;



    public InputDecorator(File_interface file_instance){
        this.file_instance = file_instance;
    }
    @Override
    public void write_data(String data) {
        //file_instance.write_data(data);
        System.out.println(data);
    }

    @Override
    public String read_data() {
        //return file_instance.read_data();
        return "File readed succesfully ";
    }
}
