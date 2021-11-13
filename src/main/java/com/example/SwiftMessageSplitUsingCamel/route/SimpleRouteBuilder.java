/**
 * 
 */
package com.example.SwiftMessageSplitUsingCamel.route;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

/**
 * @author prosanna
 *
 */
@Component
public class SimpleRouteBuilder extends RouteBuilder {

	@Override
	public void configure() throws Exception {
		from("file:D://WorkShop//folder1").to("file:D://WorkShop//folder2");
		
	}

}
