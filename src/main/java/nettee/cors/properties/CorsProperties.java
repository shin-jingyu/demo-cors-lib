package nettee.cors.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConfigurationPropertiesBinding;
import org.springframework.boot.context.properties.NestedConfigurationProperty;

@ConfigurationProperties("app.cors")
@ConfigurationPropertiesBinding
public record CorsProperties(
        @NestedConfigurationProperty
        MappedCorsProperties[] endpoints
) {
    //compact constructor
    // record는 반드시 생성자에서 인스턴스가 생성되는데 그전에 거치는곳이 컴펙트 생성자다
    public CorsProperties {
        for (var endpoint : endpoints) {
            System.out.println(endpoint);
        }
    }
}
