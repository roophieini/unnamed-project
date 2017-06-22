package pl.rybak.unnamed.commons.producers;

import org.apache.log4j.Logger;
import pl.rybak.unnamed.commons.annotations.Log;

import javax.ejb.Stateless;
import javax.enterprise.inject.Produces;
import javax.enterprise.inject.spi.InjectionPoint;

/**
 * Created by roophie on 20.06.2017.
 */

@Stateless
public class LoggingProducer {

    @Log
    @Produces
    public Logger createLoger(final InjectionPoint injectionPoint){
        return Logger.getLogger(injectionPoint.getMember().getDeclaringClass().getName());
    }

}
