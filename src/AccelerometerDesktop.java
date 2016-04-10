import java.awt.*;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.DataInputStream;
import java.net.*;
import java.util.Enumeration;

public class AccelerometerDesktop {
    static DatagramSocket sock;
    static Socket sockFoundTCP;
    static ServerSocket sockTCP;
    static Robot robo;
    static DataInputStream dis;

    public static void main(String args[]) {
        AccelerometerDesktop ad = new AccelerometerDesktop();
        System.out.println("Accelerometer Version 2.0");

        int port1 = 12001;
        int port2 = 12002;
        try {
            Enumeration e = NetworkInterface.getNetworkInterfaces();
            String str = "";
            while (e.hasMoreElements()) {
                NetworkInterface n = (NetworkInterface) e.nextElement();
                Enumeration ee = n.getInetAddresses();
                while (ee.hasMoreElements()) {
                    InetAddress i = (InetAddress) ee.nextElement();
                    str = i.getHostAddress();
                    if (str.indexOf("192") != -1) {
                        System.out.println("Type in this in your App:" + str);
                        //Temp.main(new String[]{str});
                        Temp.functionality(str, port1, port2, ad);
                        break;
                    }
                }
            }
            //System.out.println(str);
            //Temp.main(new String[]{str});


            try {
                robo = new Robot();

                sock = new DatagramSocket(12001);
                sockTCP = new ServerSocket(12002);


                new Thread(new Runnable() {
                    public void doType2_press(int keyCode1) {
                        robo.keyPress(keyCode1);
                    }

                    public void doType2_release(int keyCode1) {
                        robo.keyRelease(keyCode1);
                    }

                    public void doType(int keyCode1) {
                        robo.keyPress(keyCode1);
                        robo.keyRelease(keyCode1);
                    }

                    public void doType(int keyCode1, int keyCode2) {
                        robo.keyPress(keyCode1);
                        robo.keyPress(keyCode2);
                        robo.keyRelease(keyCode2);
                        robo.keyRelease(keyCode1);
                    }

                    public void myFunc(String receivedStr) {
                        switch (receivedStr) {
                            case "a":
                                doType(KeyEvent.VK_A);
                                break;
                            case "b":
                                doType(KeyEvent.VK_B);
                                break;
                            case "c":
                                doType(KeyEvent.VK_C);
                                break;
                            case "d":
                                doType(KeyEvent.VK_D);
                                break;
                            case "e":
                                doType(KeyEvent.VK_E);
                                break;
                            case "f":
                                doType(KeyEvent.VK_F);
                                break;
                            case "g":
                                doType(KeyEvent.VK_G);
                                break;
                            case "h":
                                doType(KeyEvent.VK_H);
                                break;
                            case "i":
                                doType(KeyEvent.VK_I);
                                break;
                            case "j":
                                doType(KeyEvent.VK_J);
                                break;
                            case "k":
                                doType(KeyEvent.VK_K);
                                break;
                            case "l":
                                doType(KeyEvent.VK_L);
                                break;
                            case "m":
                                doType(KeyEvent.VK_M);
                                break;
                            case "n":
                                doType(KeyEvent.VK_N);
                                break;
                            case "o":
                                doType(KeyEvent.VK_O);
                                break;
                            case "p":
                                doType(KeyEvent.VK_P);
                                break;
                            case "q":
                                doType(KeyEvent.VK_Q);
                                break;
                            case "r":
                                doType(KeyEvent.VK_R);
                                break;
                            case "s":
                                doType(KeyEvent.VK_S);
                                break;
                            case "t":
                                doType(KeyEvent.VK_T);
                                break;
                            case "u":
                                doType(KeyEvent.VK_U);
                                break;
                            case "v":
                                doType(KeyEvent.VK_V);
                                break;
                            case "w":
                                doType(KeyEvent.VK_W);
                                break;
                            case "x":
                                doType(KeyEvent.VK_X);
                                break;
                            case "y":
                                doType(KeyEvent.VK_Y);
                                break;
                            case "z":
                                doType(KeyEvent.VK_Z);
                                break;
                            case "A":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_A);
                                break;
                            case "B":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_B);
                                break;
                            case "C":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_C);
                                break;
                            case "D":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_D);
                                break;
                            case "E":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_E);
                                break;
                            case "F":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_F);
                                break;
                            case "G":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_G);
                                break;
                            case "H":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_H);
                                break;
                            case "I":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_I);
                                break;
                            case "J":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_J);
                                break;
                            case "K":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_K);
                                break;
                            case "L":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_L);
                                break;
                            case "M":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_M);
                                break;
                            case "N":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_N);
                                break;
                            case "O":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_O);
                                break;
                            case "P":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_P);
                                break;
                            case "Q":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Q);
                                break;
                            case "R":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_R);
                                break;
                            case "S":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_S);
                                break;
                            case "T":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_T);
                                break;
                            case "U":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_U);
                                break;
                            case "V":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_V);
                                break;
                            case "W":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_W);
                                break;
                            case "X":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_X);
                                break;
                            case "Y":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Y);
                                break;
                            case "Z":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_Z);
                                break;
                            case "`":
                                doType(KeyEvent.VK_BACK_QUOTE);
                                break;
                            case "0":
                                doType(KeyEvent.VK_0);
                                break;
                            case "1":
                                doType(KeyEvent.VK_1);
                                break;
                            case "2":
                                doType(KeyEvent.VK_2);
                                break;
                            case "3":
                                doType(KeyEvent.VK_3);
                                break;
                            case "4":
                                doType(KeyEvent.VK_4);
                                break;
                            case "5":
                                doType(KeyEvent.VK_5);
                                break;
                            case "6":
                                doType(KeyEvent.VK_6);
                                break;
                            case "7":
                                doType(KeyEvent.VK_7);
                                break;
                            case "8":
                                doType(KeyEvent.VK_8);
                                break;
                            case "9":
                                doType(KeyEvent.VK_9);
                                break;
                            case "-":
                                doType(KeyEvent.VK_MINUS);
                                break;
                            case "=":
                                doType(KeyEvent.VK_EQUALS);
                                break;
                            case "~":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_QUOTE);
                                break;
                            case "!":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_1);
                                break;
                            case "@":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_2);
                                break;
                            case "#":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_3);
                                break;
                            case "$":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_4);
                                break;
                            case "%":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_5);
                                break;
                            case "^":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_6);
                                break;
                            case "&":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_7);
                                break;
                            case "*":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_8);
                                break;
                            case "(":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_9);
                                break;
                            case ")":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_0);
                                break;
                            case "_":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_MINUS);
                                break;
                            case "+":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_EQUALS);
                                break;
                            case "\t":
                                doType(KeyEvent.VK_TAB);
                                break;
                            case "[":
                                doType(KeyEvent.VK_OPEN_BRACKET);
                                break;
                            case "]":
                                doType(KeyEvent.VK_CLOSE_BRACKET);
                                break;
                            case "\\\\":
                                doType(KeyEvent.VK_BACK_SLASH);
                                break;
                            case "{":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_OPEN_BRACKET);
                                break;
                            case "}":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_CLOSE_BRACKET);
                                break;
                            case "|":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_BACK_SLASH);
                                break;
                            case ";":
                                doType(KeyEvent.VK_SEMICOLON);
                                break;
                            case ":":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_COLON);
                                break;
                            case "\\":
                                doType(KeyEvent.VK_BACK_SLASH);
                                break;
                            case "\'":
                                doType(KeyEvent.VK_QUOTEDBL);
                                break;
                            case "\"":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_QUOTEDBL);
                                break;
                            case ",":
                                doType(KeyEvent.VK_COMMA);
                                break;
                            case "<":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_COMMA);
                                break;
                            case ".":
                                doType(KeyEvent.VK_PERIOD);
                                break;
                            case ">":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_PERIOD);
                                break;
                            case "/":
                                doType(KeyEvent.VK_SLASH);
                                break;
                            case "?":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_SLASH);
                                break;
                            case " ":
                                doType(KeyEvent.VK_SPACE);
                                break;
                            case "÷":
                                doType(KeyEvent.VK_SLASH);
                                break;
                            case "×":
                                doType(KeyEvent.VK_SHIFT, KeyEvent.VK_8);
                                break;


                            default:
                                throw new IllegalArgumentException("Cannot type character " + receivedStr);
                        }

                    }

                    public void run() {
                        while (true) {
                            try {
                                sockFoundTCP = sockTCP.accept();
                                System.out.println("TCP client found on port 12002");
                                dis = new DataInputStream(sockFoundTCP.getInputStream());
                                break;
                            } catch (Exception e) {
                                System.out.println(e.toString());
                                System.exit(0);
                            }
                        }
                        while (true) {
                            try {
                                String receivedStr = dis.readUTF();
                                if (receivedStr.indexOf("backspace@99") != -1) {
                                    doType(KeyEvent.VK_BACK_SPACE);
                                } else if (receivedStr.indexOf("enter@99") != -1) {
                                    doType(KeyEvent.VK_ENTER);
                                } else if (receivedStr.indexOf("enter@99") != -1) {
                                    doType(KeyEvent.VK_ENTER);
                                } else if (receivedStr.indexOf("up_press@99") != -1) {
                                    doType2_press(KeyEvent.VK_UP);
                                } else if (receivedStr.indexOf("up_unpress@99") != -1) {
                                    doType2_release(KeyEvent.VK_UP);
                                } else if (receivedStr.indexOf("down_press@99") != -1) {
                                    doType2_press(KeyEvent.VK_DOWN);
                                } else if (receivedStr.indexOf("down_unpress@99") != -1) {
                                    doType2_release(KeyEvent.VK_DOWN);
                                } else if (receivedStr.indexOf("left_press@99") != -1) {
                                    doType2_press(KeyEvent.VK_LEFT);
                                } else if (receivedStr.indexOf("left_unpress@99") != -1) {
                                    doType2_release(KeyEvent.VK_LEFT);
                                } else if (receivedStr.indexOf("right_press@99") != -1) {
                                    doType2_press(KeyEvent.VK_RIGHT);
                                } else if (receivedStr.indexOf("right_unpress@99") != -1) {
                                    doType2_release(KeyEvent.VK_RIGHT);
                                } else {
                                    for (int i = 0; i < receivedStr.length(); i++) {
                                        System.out.println(receivedStr.charAt(i));
                                        myFunc(receivedStr.charAt(i) + "");
                                    }
                                }
                            } catch (Exception e) {
                                System.out.println(e.toString());
                                System.exit(0);
                            }
                        }
                    }
                }).start();


            } catch (Exception exc) {
                exc.printStackTrace();
                System.exit(0);
            }

            byte[] recData = new byte[60];
            while (true) {
                try {
                    DatagramPacket p = new DatagramPacket(recData, recData.length);
                    sock.receive(p);
                    String temp = new String(p.getData());
                    if (temp.indexOf("LeftDown") >= 0) {
                        left_click_down();
                        System.out.println("Left Down");
                    } else if (temp.indexOf("LeftUp") >= 0) {
                        System.out.println("Left Up");
                        left_click_up();
                    } else if (temp.indexOf("RightDown") >= 0) {
                        System.out.println("RightDown");
                        right_click_down();
                    } else if (temp.indexOf("RightUp") >= 0) {
                        System.out.println("RightUp");
                        right_click_up();
                    }
                    else if(temp.indexOf("scroll_up") >= 0){
                        System.out.println("scroll up");
                        scrollUp();
                    }
                    else if(temp.indexOf("scroll_down") >= 0){
                        System.out.println("scroll up");
                        scrollDown();
                    }
                    else {
                        String var[] = temp.split(",");
                        //float ax=Float.parseFloat(var[0]);
                        //float ay=Float.parseFloat(var[1]);
                        //float az=Float.parseFloat(var[2]);
                        float gx = Float.parseFloat(var[0]);
                        float gy = Float.parseFloat(var[1]);
                        float gz = Float.parseFloat(var[2]);
                        //System.out.println("gx="+gx+", gy="+gy+", gz="+gz);

                        PointerInfo a = MouseInfo.getPointerInfo();
                        Point b = a.getLocation();

                        int prev_x = (int) b.getX();
                        int prev_y = (int) b.getY();
                        robo.mouseMove(prev_x - (int) (gz * 40f), prev_y - (int) (gx * 40f));
                    }
                } catch (Exception exc) {
                    System.exit(0);
                    exc.printStackTrace();
                }


            }
        }catch (Exception e){System.exit(0);}
    }

    private static void left_click_down() {
        //System.out.println("left_click");
        robo.mousePress(InputEvent.BUTTON1_MASK);
    }

    private static void left_click_up() {

        robo.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    private static void right_click_down() {
        //System.out.println("right_click");
        robo.mousePress(InputEvent.BUTTON3_MASK);
    }

    private static void right_click_up() {

        robo.mouseRelease(InputEvent.BUTTON3_MASK);
    }

    private static void scrollUp(){
        System.out.println("Scroll up!!");
        robo.mouseWheel(1);
    }

    private static void scrollDown(){
        System.out.println("scroll down!!");
        robo.mouseWheel(-1);
    }



}
