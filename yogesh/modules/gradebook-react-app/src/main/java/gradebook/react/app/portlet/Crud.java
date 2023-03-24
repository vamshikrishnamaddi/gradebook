package gradebook.react.app.portlet;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCRenderCommand;

import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;

import gradebook.react.app.constants.GradebookReactAppPortletKeys;
@Component(
		immediate = true,
		property = {"javax.portlet.name=" + GradebookReactAppPortletKeys.GradebookReactApp,
					"mvc.command.name=/create/edit"
				}
		)

public class Crud implements MVCRenderCommand{

	@Override
	public String render(RenderRequest renderRequest, RenderResponse renderResponse) throws PortletException {
		// TODO Auto-generated method stub
		return "/edit.jsp";
	}

}
