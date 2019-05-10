package picture;

import java.util.Scanner;

public class Main {

	   public static void main(String[] args) {
	      // [1]���� [2]��κ���

	      // [1] ���� �޴� ���� ��
	      // [1]Rect [2]Cir [3]Tri >> 1
	      // color >> red
	      
	      // [2] ��κ��� ���� ��
	      // Rect (red)
	      
	      Scanner sc = new Scanner(System.in);
	      GraphicTool gt = new GraphicTool();
	      
	      while(true){
	         System.out.println("[1]���� [2]��κ���");
	         int choice = sc.nextInt();
	         if (choice == 1) {
	            System.out.print("[1]Rect [2]Cir [3]Tri >> ");
	            int num = sc.nextInt();
	            System.out.print("color >> ");
	            String color = sc.next();
	            Shape sh = null;
	            
	            if (num == 1) {
	               sh = new Rect(color);
	            }else if (num == 2) {
	               sh = new Cir(color);
	            }else if (num == 3) {
	               sh = new Tri(color);
	            }
	            
	            gt.addShape(sh);
	         }else if (choice == 2) {
	            gt.allDraw();
	         }
	         
	      }
	      
	      
	   }

	}
