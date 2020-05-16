/**
 * Created by Administrator on 2019/2/14.
 */

import com.zoctan.api.Application;
import com.zoctan.api.dto.AccountWithRole;
import com.zoctan.api.service.AccountService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;

/**
 * SpringBoot 测试类
 *
 * @RunWith:启动器 SpringJUnit4ClassRunner.class：让 junit 与 spring 环境进行整合
 * @SpringBootTest(classes={App.class}) 1, 当前类为 springBoot 的测试类
 * @SpringBootTest(classes={App.class}) 2, 加载 SpringBoot 启动类。启动springBoot
 * junit 与 spring 整合@Contextconfiguartion("classpath:applicationContext.xml")
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = {Application.class})
public class AccountTest {

    @Autowired
    private AccountService accountService;

    @Test
    public void list(){
        final List<AccountWithRole> list = accountService.listAllWithRole();
        System.out.println(list);
        for(AccountWithRole role : list){
            System.out.println(role.getRoleName());
        }
    }

}
