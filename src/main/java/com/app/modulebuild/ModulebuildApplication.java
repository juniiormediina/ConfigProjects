package com.app.modulebuild;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Scanner;

public class ModulebuildApplication {

    public static void main(String[] args) {

//      Repository names
        String moduloBack = "NU0089001_Modulo_Transversal_SNF_Ecosistemas_MR/";
        String moduloFront = "NU0089001_Modulo_Transversal_SNF_Ecosistemas_Frontend/";

//      Project names
        String backAdmin = "back_admin/";
        String msBackAdmin = "ms_back_admin/";
        String msAuthorization = "ms_authorization/";
        String msGateway = "ms_gateway/";
        String msSendFunctionalLogs = "ms_send_functional_logs/";
        String msTermsConditions = "ms_termsconditions/";

//        System.out.println("----------------------------------MODULO TRANSVERSAL----------------------------------");
//        System.out.println("--------------------------------------ECOSISTEMAS-------------------------------------");
//        System.out.println("--------------------------------------------------------------------------------------");

        System.out.println(",--.   ,--.  ,-----.  ,------.   ,--. ,--. ,--.     ,-----.    ,--------. ,------.    ," + "---.   ,--.  ,--.  ,---.   ,--.   ,--. ,------. ,------.   ,---.     ,---.   ,--.    ");
        System.out.println("|   `.'   | '  .-.  ' |  .-.  \\  |  | |  | |  |    '  .-.  '   '--.  .--' |  .--. '  /  "
                + "O  \\  |  ,'.|  | '   .-'   \\  `.'  /  |  .---' |  .--. ' '   .-'   /  O  \\  |  |    ");
        System.out.println("|  |'.'|  | |  | |  | |  |  \\  : |  | |  | |  |    |  | |  |      |  |    |  '--'.' |  " + ".-.  | |  |' '  | `.  `-.    \\     /   |  `--,  |  '--'.' `.  `-.  |  .-.  | |  |    ");
        System.out.println("|  |   |  | '  '-'  ' |  '--'  / '  '-'  ' |  '--. '  '-'  '      |  |    |  |\\  \\  |  "
                + "| |  | |  | `   | .-'    |    \\   /    |  `---. |  |\\  \\  .-'    | |  | |  | |  '--. ");
        System.out.println("`--'   `--'  `-----'  `-------'   `-----'  `-----'  `-----'       `--'    `--' '--' `--' "
                + "`--' `--'  `--' `-----'      `-'     `------' `--' '--' `-----'  `--' `--' `-----' ");

        System.out.println(",------.  ,-----.  ,-----.   ,---.   ,--.  ,---.   ,--------. ,------. ,--.   ,--.   ," + "---" + ".    ,---.   ");
        System.out.println("|  .---' '  .--./ '  .-.  ' '   .-'  |  | '   .-'  '--.  .--' |  .---' |   `.'   |  /  O "
                + " \\  '   .-'  ");
        System.out.println("|  `--,  |  |     |  | |  | `.  `-.  |  | `.  `-.     |  |    |  `--,  |  |'.'|  | |  .-" + "." + "  | `.  `-.  ");
        System.out.println("|  `---. '  '--'\\ '  '-'  ' .-'    | |  | .-'    |    |  |    |  `---. |  |   |  | |  | "
                + "|  | .-'    | ");
        System.out.println("`------'  `-----'  `-----'  `-----'  `--' `-----'     `--'    `------' `--'   `--' `--' " + "`--' `-----'  ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("aws_access_key: ");
        String aws_access_key = scanner.nextLine();
//        System.out.println("aws_secret_key: ");
//        String aws_secret_key = scanner.nextLine();
//        System.out.println("aws_region [default us-east-1]: ");
//        String aws_region = scanner.nextLine();
//        System.out.println("azure_client_id: ");
//        String azure_client_id = scanner.nextLine();
//        System.out.println("azure_tenant_id: ");
//        String azure_tenant_id = scanner.nextLine();
//        System.out.println("azure_secret_id: ");
//        String azure_secret_id = scanner.nextLine();

//        System.out.println(aws_access_key);
//        System.out.println(aws_secret_key);
//        System.out.println(aws_region);
//        System.out.println(azure_client_id);
//        System.out.println(azure_tenant_id);
//        System.out.println(azure_secret_id);

        File archivo = null;
        FileReader fr = null;
        BufferedReader br = null;
//
        try {
//          Apertura del fichero y creacion de BufferedReader para poder hacer una lectura comoda (disponer del
//          metodo readLine()).
//          To avoid referring non-static method inside main() static method
            ReadFileFromClasspath instance = new ReadFileFromClasspath();
            File file = instance.getFile("local_config.run.xml");

//          validate file path
            System.out.println("PATH---------------------------------------------------------------------------------");
            System.out.println(file.getPath());
            System.out.println("-------------------------------------------------------------------------------------");

            fr = new FileReader(file);
            br = new BufferedReader(fr);

//          Read file
            String lines;
            while ((lines = br.readLine()) != null) {
                System.out.println(lines);
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        } finally {
//          cerramos el fichero, para asegurarnos que se cierra tanto si todo va bien como si salta una excepcion.
            try {
                if (null != fr) {
                    fr.close();
                }
            } catch (Exception e2) {
                System.out.println("An error occurred.");
                e2.printStackTrace();
            }
        }

//        Cerrar el escáner y salir de la aplicación
//        escaner.close();
//        System.exit(0);


    }

}


