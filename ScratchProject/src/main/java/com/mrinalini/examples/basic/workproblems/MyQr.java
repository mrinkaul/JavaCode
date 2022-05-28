package com.mrinalini.examples.basic.workproblems;



import java.util.Scanner;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import com.google.zxing.BarcodeFormat;
import com.google.zxing.EncodeHintType;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.NotFoundException;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.qrcode.decoder.ErrorCorrectionLevel;

public class MyQr {

    // Function to create the QR code
    public static void createQR(String data, String path,
                                String charset, Map hashMap,
                                int height, int width)
            throws WriterException, IOException
    {

        BitMatrix matrix = new MultiFormatWriter().encode(
                new String(data.getBytes(charset), charset),
                BarcodeFormat.QR_CODE, width, height);

        MatrixToImageWriter.writeToFile(
                matrix,
                path.substring(path.lastIndexOf('.') + 1),
                new File(path));
    }

    // Driver code
    public static void main(String[] args)


            throws WriterException, IOException,
            NotFoundException


    {
        System.out.println("my favorite classical pieces: 1, 2, 3, 4, and 5.");
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter your choice.");
        String choice = myObj.nextLine();

        String data;
        if(choice.equals("1")){
            data = "www.youtube.com/watch?v=b44-5M4e9nI&list=PLfrM_UpO85NqqOZGNDymvc5OsHVXpbMFb&index=5";
        }
        else if(choice.equals("2")){
            data = "www.youtube.com/watch?v=jiCEuNZSDm4";
        }
        else if(choice.equals("3")){
            data = "www.youtube.com/watch?v=O2deXwf4drE";
        }
        else if(choice.equals("4")){
        data = "www.youtube.com/watch?v=9Fle2CP8gR0";
        }
        else if(choice.equals("4")){
            data = "www.youtube.com/watch?v=LP_us9dTj5g";
        }
        else if (choice.equals("5")){
            data = "www.youtube.com/watch?v=LP_us9dTj5g";
            System.out.println("bonus points if you know the piece by its more common name.");
        }

        else{
            data = "www.youtube.com/watch?v=dQw4w9WgXcQ";
            System.out.println("!you discovered the secret composition! have fun!");
        }

        String path = "demo.png";

        String charset = "UTF-8";

        Map<EncodeHintType, ErrorCorrectionLevel> hashMap
                = new HashMap<EncodeHintType,
                ErrorCorrectionLevel>();

        hashMap.put(EncodeHintType.ERROR_CORRECTION,
                ErrorCorrectionLevel.L);

        createQR(data, path, charset, hashMap, 200, 200);
        System.out.println("qr code has been generated. enjoy the music");
    }
}
