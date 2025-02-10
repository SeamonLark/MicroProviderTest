package eu.axasoft.microprovidertest;

import jakarta.inject.Named;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import jakarta.inject.Provider;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 *
 * @author kralmatej
 */
@Named(value = "providerBean")
@ApplicationScoped
public class ProviderBean {

    @Inject
    @ConfigProperty(name = "transReportIntevals", defaultValue = "1")
    private Provider<String> transIntervals;
    
    public ProviderBean() {
    }

    public String getTransIntervals() {
        if (transIntervals != null) {
            return transIntervals.get();
        }
        return "Failed to get";
    }
    
}
