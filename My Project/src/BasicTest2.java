import com.borland.silktest.jtf.Desktop;
import org.junit.Before;
import com.borland.silktest.jtf.BrowserBaseState;
import org.junit.Test;
import com.borland.silktest.jtf.xbrowser.BrowserApplication;
import com.borland.silktest.jtf.xbrowser.BrowserWindow;

public class BasicTest2 {

	private Desktop desktop = new Desktop();

	@Before
	public void baseState() {
		// Go to web page 'http://www.borland.com'
		BrowserBaseState baseState = new BrowserBaseState();
		baseState.execute(desktop);
	}

	@Test
	public void test() {
		desktop.<BrowserApplication> find("WebBrowser").setActive();
		desktop.<BrowserWindow> find("borland_com.BrowserWindow").navigate(
				"http://www.orf.at/");
	}

}