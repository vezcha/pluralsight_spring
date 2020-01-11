import com.pluralsight.services.CustomerService;
import com.pluralsight.services.CustomerServiceImpl;

public class Application {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		CustomerService service = new CustomerServiceImpl();
		
		System.out.println(service.findAll().get(0).getFirstName()); //example of happy path testing. [test that should work no problem]

	}

}
