package org.sakaiproject.sentry;

import com.getsentry.raven.DefaultRavenFactory;
import com.getsentry.raven.Raven;
import com.getsentry.raven.dsn.Dsn;

/**
 * This uses the DockerEventBuilder to set the hostname from the environment.
 */
public class DockerRavenFactory extends DefaultRavenFactory {

    @Override
    public Raven createRavenInstance(Dsn dsn) {
        Raven ravenInstance = super.createRavenInstance(dsn);
        ravenInstance.addBuilderHelper(new DockerEventBuilderHelper());
        return ravenInstance;
    }
}
