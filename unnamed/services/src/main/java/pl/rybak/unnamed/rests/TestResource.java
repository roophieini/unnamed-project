package pl.rybak.unnamed.rests;

import org.apache.log4j.Logger;
import pl.rybak.unknown.domain.test.TestEntity;
import pl.rybak.unnamed.commons.annotations.Log;

import javax.ejb.Stateless;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

/**
 * Created by roophie on 20.06.2017.
 */
@Path("/test")
@Stateless
public class TestResource {
    @Inject @Log
    private Logger LOG;

    @PersistenceContext(unitName = "unnamedPU")
    private EntityManager em;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public Response ok(){
        String info = "I'm Alive";
        LOG.info(info);
        TestEntity entity = new TestEntity();
        entity.setId(1L);
        entity.setNazwa(info);
        em.persist(entity);
        entity = em.merge(entity);
        return Response.ok(entity).build();
    }

}
