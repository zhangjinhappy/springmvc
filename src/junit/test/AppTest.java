package junit.test;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.offcn.bean.Shop;
import com.offcn.mapper.ShopMapper;

public class AppTest {
	@Autowired
	private ShopMapper shop;
	@Test
	public void test01() throws SQLException, IOException{
		 //配置文件
		 
        InputStream is = Resources.getResourceAsStream("mybatis.xml");
 
        //使用工厂
 
        SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
 
        //生产sqlsession
 
        SqlSession session = factory.openSession();
 
         //加载mapper文件中，详细到方法
 
        shop = session.getMapper(ShopMapper.class);
 
        List<Shop> list =shop.getShopList();
        
        for (Shop shop : list) {
        	System.out.println(shop);
		}
            
 
 
        session.close();
	}

}
