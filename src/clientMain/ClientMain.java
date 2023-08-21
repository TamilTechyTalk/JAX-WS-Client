package clientMain;

import javax.xml.ws.WebServiceClient;

import com.soap.ws.client.generated.HelloWs;
import com.soap.ws.client.generated.HelloWsService;

@WebServiceClient
public class ClientMain {

	public static void main(String[] args) {

		System.out.println(getSayHello());
	}

	public static String getSayHello() {
		HelloWsService helloWsService = new HelloWsService();
		HelloWs helloWs = helloWsService.getHelloWsPort();
		return helloWs.sayHello("Tamil");

	}

}
