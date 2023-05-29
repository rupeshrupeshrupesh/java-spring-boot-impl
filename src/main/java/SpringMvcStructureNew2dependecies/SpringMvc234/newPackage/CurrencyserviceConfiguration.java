package SpringMvcStructureNew2dependecies.SpringMvc234.newPackage;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "currency-service")

@Data
@Component
public class CurrencyserviceConfiguration {

private String url;
private  String userName;
private String key;

}
