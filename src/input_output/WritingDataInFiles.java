package input_output;

import java.io.FileWriter;
import java.io.IOException;

public class WritingDataInFiles {
    public static void main(String[] args) {
        String shortText = "Imi place sa programez in Java";
        String longText = "Lorem ipsum dolor sit amet, consectetur adipiscing elit. Proin feugiat posuere velit id vestibulum. Aenean a elit lacus. Proin vitae nulla gravida nisl efficitur molestie. Duis eu pulvinar erat, vitae euismod est. Aliquam eu tempor turpis. Maecenas congue nisl a condimentum maximus. Maecenas fermentum convallis enim, a varius dolor aliquet sit amet. Fusce commodo massa at condimentum commodo. In varius urna quam, a ornare ligula efficitur a.\n" +
                "\n" +
                "Praesent feugiat vehicula nibh et condimentum. Maecenas ornare posuere erat. Sed eu felis tellus. Phasellus vel euismod elit, vitae aliquet elit. Interdum et malesuada fames ac ante ipsum primis in faucibus. Morbi venenatis ex et libero tincidunt auctor. Proin sit amet fringilla sapien. Sed eu feugiat augue. Proin auctor, mauris sit amet lobortis cursus, lacus ante sollicitudin elit, at hendrerit dolor nulla vitae odio. Vivamus ornare felis id vulputate placerat. Vestibulum dignissim neque orci, ut congue nulla venenatis at. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Vestibulum varius cursus ante, et tincidunt turpis ultricies at. Pellentesque habitant morbi tristique senectus et netus et malesuada fames ac turpis egestas. Nullam mi metus, malesuada sed arcu sed, tincidunt semper nunc.\n" +
                "\n" +
                "Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Nullam a euismod lectus. Vestibulum eu iaculis velit. Vestibulum ante ipsum primis in faucibus orci luctus et ultrices posuere cubilia curae; Nunc fermentum sodales ex at iaculis. Aliquam a ante ullamcorper, euismod enim tincidunt, ornare nulla. Praesent volutpat elit vel tellus ultricies, quis dignissim magna ullamcorper. Curabitur venenatis, nisi et tincidunt pulvinar, sapien lectus viverra risus, at rutrum mi sem at massa. Nullam non justo ligula. Curabitur dolor est, auctor id sem ac, pharetra luctus elit.\n" +
                "\n" +
                "Aenean suscipit ipsum neque, id dapibus enim varius eu. Fusce ornare nisl lacus, vitae aliquet libero tincidunt sed. Aliquam interdum quam mi, in pellentesque ligula vestibulum nec. Interdum et malesuada fames ac ante ipsum primis in faucibus. Mauris commodo quis nisi vel malesuada. Integer condimentum massa vel pharetra accumsan. Suspendisse venenatis, nisl ac euismod tempor, sem nulla finibus nisl, quis fringilla dolor elit ac diam. Mauris eu fermentum risus.\n" +
                "\n" +
                "Donec non gravida orci. In auctor et ex ac malesuada. Nulla risus felis, tempor ac turpis nec, blandit cursus lacus. Praesent imperdiet enim sagittis, malesuada ante at, accumsan mauris. Morbi accumsan nisi quis justo semper, vitae rutrum sapien laoreet. Sed accumsan sapien a pharetra rutrum. Fusce venenatis quam non arcu fringilla posuere. Praesent vehicula porta mauris sed consectetur. Ut tortor sapien, elementum non nulla faucibus, vehicula rhoncus nunc. Nulla tempus magna suscipit tincidunt auctor. Maecenas pharetra, sem fermentum eleifend dictum, leo diam suscipit felis, vel suscipit dolor enim consectetur arcu. Fusce porttitor mi lectus.";
        String path = "C:\\Users\\Ge\\Desktop\\";
        String filename = "text.txt";

        try {
            FileWriter localWriter = new FileWriter("fisierul_meu.txt");
            FileWriter fileWriter = new FileWriter(path + filename);

            localWriter.write(shortText);
            fileWriter.write(longText);

            localWriter.close();
            fileWriter.close();

        } catch (IOException e){
            System.out.println("ERROR: " + e.getMessage());
            e.printStackTrace(); //Prints this throwable and its backtrace to the specified print stream.
        }
    }
}
