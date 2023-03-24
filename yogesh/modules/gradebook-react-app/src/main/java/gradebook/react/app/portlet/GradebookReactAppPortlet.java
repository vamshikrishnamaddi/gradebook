package gradebook.react.app.portlet;

import gradebook.react.app.constants.GradebookReactAppPortletKeys;

import com.liferay.counter.kernel.service.CounterLocalService;
import com.liferay.frontend.js.loader.modules.extender.npm.NPMResolver;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import com.liferay.training.gradebook.model.Krishna;
import com.liferay.training.gradebook.service.KrishnaLocalServiceUtil;
import com.liferay.training.gradebook.service.impl.KrishnaLocalServiceImpl;
import com.liferay.training.gradebook.service.impl.KrishnaServiceImpl;
//import com.liferay.training.gradebook.service.KrishnaLocalService;
//import com.liferay.training.gradebook.service.impl.java.*;



/**
 * @author me
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/index.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + GradebookReactAppPortletKeys.GradebookReactApp,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class GradebookReactAppPortlet extends MVCPortlet {

	@Override
	public void doView(
			RenderRequest renderRequest, RenderResponse renderResponse)
		throws IOException, PortletException {
		PrintWriter printWriter = renderResponse.getWriter();
		printWriter.println("Welcome To My Page by Vamshi Krishna");
		
//		KrishnaLocalServiceImpl a = new KrishnaLocalServiceImpl();
//		a.AddVamshiKrishna("Chaitanaya","Sammetla",143);
//		try {
////			KrishnaServiceImpl b = new KrishnaServiceImpl();
////			Krishna m = b.adds("Chaitanaya","Sammetla",144);
////			printWriter.println(m);
//			Krishna m = xyz.adds("Chaitanaya","Sammetla",145);
//			printWriter.println(m);
//		}
//		catch(Exception e)
//		{
//			printWriter.println(e);
//		}
		
		
//		int userId = (int) counterLocalService.increment(Krishna.class.getName());
//		
//		
//		
//	   KrishnaLocalServiceUtil.AddVamshiKrishna("Hello","World", userId);
		renderRequest.setAttribute(
			"mainRequire",
			_npmResolver.resolveModuleName("gradebook-react-app") + " as main");
		
		super.doView(renderRequest, renderResponse);
	}

	@Reference
	private NPMResolver _npmResolver;
	@Reference
	private CounterLocalService counterLocalService;
//	@Reference
//	private KrishnaServiceImpl xyz;

}