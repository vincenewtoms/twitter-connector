
package org.mule.twitter.adapters;

import javax.annotation.Generated;
import org.mule.api.MuleEvent;
import org.mule.api.MuleMessage;
import org.mule.api.devkit.ProcessAdapter;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.devkit.ProcessTemplate;
import org.mule.api.processor.MessageProcessor;
import org.mule.api.routing.filter.Filter;
import org.mule.security.oauth.callback.ProcessCallback;
import org.mule.twitter.TwitterConnector;


/**
 * A <code>TwitterConnectorProcessAdapter</code> is a wrapper around {@link TwitterConnector } that enables custom processing strategies.
 * 
 */
@Generated(value = "Mule DevKit Version 3.5.0-SNAPSHOT", date = "2014-04-21T01:59:11-05:00", comments = "Build UNKNOWN_BUILDNUMBER")
public class TwitterConnectorProcessAdapter
    extends TwitterConnectorLifecycleAdapter
    implements ProcessAdapter<TwitterConnectorCapabilitiesAdapter>
{


    public<P >ProcessTemplate<P, TwitterConnectorCapabilitiesAdapter> getProcessTemplate() {
        final TwitterConnectorCapabilitiesAdapter object = this;
        return new ProcessTemplate<P,TwitterConnectorCapabilitiesAdapter>() {


            @Override
            public P execute(ProcessCallback<P, TwitterConnectorCapabilitiesAdapter> processCallback, MessageProcessor messageProcessor, MuleEvent event)
                throws Exception
            {
                return processCallback.process(object);
            }

            @Override
            public P execute(ProcessCallback<P, TwitterConnectorCapabilitiesAdapter> processCallback, Filter filter, MuleMessage message)
                throws Exception
            {
                return processCallback.process(object);
            }

        }
        ;
    }

}
