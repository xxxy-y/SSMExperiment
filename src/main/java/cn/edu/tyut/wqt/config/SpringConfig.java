package cn.edu.tyut.wqt.config;

import org.springframework.context.annotation.*;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.TransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

import javax.sql.DataSource;

/**
 * @Author 羊羊
 * @ClassName SpringConfig
 * @SubmitTime 周六
 * @DATE 2023/12/16
 * @Time 22:30
 * @Package_Name cn.edu.tyut.wqt.config
 */
@Configuration
@Import({
        MybatisConfig.class,
        JdbcConfig.class
})
@ComponentScans({
        @ComponentScan("cn.edu.tyut.wqt.service")
})
@EnableAspectJAutoProxy
@EnableTransactionManagement
public class SpringConfig {
    @Bean
    public TransactionManager transactionManager(DataSource dataSource) {
        DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager();
        dataSourceTransactionManager.setDataSource(dataSource);
        return dataSourceTransactionManager;
    }

    @Bean
    public InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
        viewResolver.setPrefix("/WEB-INF/pages/");
        viewResolver.setSuffix(".jsp");
        return viewResolver;
    }
}