package ru.kogut;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.kogut.enterprise.configuration.ApplicationConfiguration;
import ru.kogut.enterprise.model.dictionaries.ClientEntity;
import ru.kogut.enterprise.service.dictionaries.ClientServiceImpl;

public class MainTest {

    @Test
    public void TestClient(){
        final ApplicationContext ctx = new AnnotationConfigApplicationContext(ApplicationConfiguration.class);
        final ClientServiceImpl clientService = ctx.getBean(ClientServiceImpl.class);
        ClientEntity client = new ClientEntity();
        client.setName("OOO Test client");
        client.setKod("00001");
        client.setPhizAddress("address1");
        client.setUrAddress("address2");
        client.setDiscription("Discription");
        clientService.save(client);
        Assert.assertNotNull(client.getId());
        Assert.assertEquals(false,client.isDelete());
        clientService.delete(client, true);
        Assert.assertEquals(true,client.isDelete());
        client.setName("OOO Test2");
        clientService.update(client);
        Assert.assertEquals("OOO Test2", client.getName());
    }

}
