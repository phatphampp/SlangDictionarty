/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package slangword;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author phatp
 */
public class SlangWord {

    public static  Map<String, List<String>> data_Root;
    public static List<String> listHistorySlang = new ArrayList<String>();
    public static BufferedReader br=new BufferedReader(new InputStreamReader( System.in));  
    static String current = System.getProperty("user.dir");
    public static String outputFile = current + "\\output.txt";
    public static String rootFile = current + "\\slang.txt";
    
    public static void main(String[] args) throws IOException {
        System.out.println("1. Chức năng tìm kiếm theo slang word.");
        System.out.println("2. Chức năng tìm kiếm theo definition.");
        System.out.println("3. Chức năng hiển thị history");
        System.out.println("4. Chức năng add 1 slang words mới.");
        System.out.println("5. Chức năng edit 1 slang word.");
        System.out.println("6. Chức năng delete 1 slang word.");
        System.out.println("7. Chức năng reset danh sách slang words gốc.");
        System.out.println("8. Chức năng random 1 slang word (On this day slang word).");
        System.out.println("9. Chức năng đố vui, chương trình hiển thị 1 random slang word, với 4 đáp án cho " +
"người dùng chọn.");
        System.out.println("10. Chức năng đố vui, chương trình hiển thị 1 definition, với 4 slang words đáp án cho " +
"người dùng chọn.");
        System.out.println("0. Thoat chuong trinh");
        
        Scanner scan = new Scanner(System.in);
        int nChucNang = -1;
        
        while (nChucNang != 0) {
            System.out.print("Vui long chon chuc nang: ");
            nChucNang = Integer.parseInt(scan.nextLine());
            switch (nChucNang){
                case 1: {
                    System.out.print("Nhap slang word:");
                    String keySlang = br.readLine();
                    listHistorySlang.add(keySlang);
                    ChucNang1(keySlang);                  
                    break;
                
                }
                case 0: {
                    System.out.println("BAN VUA CHON THOAT !!! ");
                    break;
                }
            }
        }
        
    }
    
    public static void ChucNang1(String key){
    	key = key.toUpperCase();
    	if(data_Root.get(key)!= null ) {
    		System.out.println("Cac definition cua " + key + " la: ");
    		for(String item : data_Root.get(key))
                {
                    System.out.println("+ " + item);
                }
    	}
    	else {
    		System.out.println("Khong tim thay definition");
    	}
    }
}
