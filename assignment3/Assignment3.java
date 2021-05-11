import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;
public class Assignment3{
	public String getTime(String line) {
		int startIdx = line.indexOf("time=");
		return line.substring(startIdx+5, startIdx+9);
	}
	public void executePing(int packets,String host) throws IOException{
		ProcessBuilder pb = new ProcessBuilder("ping",host,"-c",Integer.toString(packets));
		Process process = pb.start();
		BufferedReader br = new BufferedReader(new InputStreamReader(process.getInputStream()));
		br.readLine();
		ArrayList<Double> times = new ArrayList<Double>();
		for(int i = 0; i < packets;i++) {
			times.add(Double.parseDouble(getTime(br.readLine())));
		}
		Collections.sort(times);
		if(times.size()%2 != 0) {
			System.out.println(times.get((times.size()-1)/2));
		}
		else {
			int midIdx = times.size()/2;
			System.out.println((times.get(midIdx-1)+ times.get(midIdx))/2);
		}
	}
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter host address");
        String host = sc.nextLine();
		System.out.println("Enter number of packets you want to send");
		int packets = sc.nextInt();
		Assignment3 ex = new Assignment3();
		ex.executePing(packets,host);
	}
}
