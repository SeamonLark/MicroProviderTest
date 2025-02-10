package eu.axasoft.microprovidertest;

import jakarta.inject.Named;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;
import java.util.function.Supplier;
import org.eclipse.microprofile.config.inject.ConfigProperty;

/**
 *
 * @author kralmatej
 */
@Named(value = "supplierBean")
@ApplicationScoped
public class SupplierBean {

    @Inject
    @ConfigProperty(name = "transReportIntevals", defaultValue = "1")
    private Supplier<String> transIntervals;
    
    public SupplierBean() {
    }

    public String getTransIntervals() {
        if (transIntervals != null) {
            return transIntervals.get();
        }
        return "Failed to get";
    }
    
}
