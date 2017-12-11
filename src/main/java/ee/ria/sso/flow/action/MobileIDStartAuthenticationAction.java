package ee.ria.sso.flow.action;

import org.springframework.stereotype.Component;
import org.springframework.webflow.action.AbstractAction;
import org.springframework.webflow.execution.Event;
import org.springframework.webflow.execution.RequestContext;

import ee.ria.sso.service.AuthenticationService;

/**
 * @author Janar Rahumeel (CGI Estonia)
 */

@Component
public class MobileIDStartAuthenticationAction extends AbstractAction {

    private final AuthenticationService authenticationService;

    public MobileIDStartAuthenticationAction(AuthenticationService authenticationService) {
        this.authenticationService = authenticationService;
    }

    /*
     * RESTRICTED METHODS
     */

    @Override
    protected Event doExecute(RequestContext requestContext) throws Exception {
        return this.authenticationService.startLoginByMobileID(requestContext);
    }

}