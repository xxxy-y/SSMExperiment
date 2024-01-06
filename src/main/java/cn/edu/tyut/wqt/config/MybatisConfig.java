package cn.edu.tyut.wqt.config;

import org.apache.ibatis.session.AutoMappingBehavior;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

import javax.sql.DataSource;

/**
 * @Author 羊羊
 * @ClassName MybatisConfig
 * @SubmitTime 周六
 * @DATE 2023/12/16
 * @Time 22:30
 * @Package_Name cn.edu.tyut.wqt.config
 */
@MapperScan("cn.edu.tyut.wqt.mapper")
public class MybatisConfig {
    @Bean
    public SqlSessionFactoryBean getSqlSessionFactoryBean(@Autowired DataSource dataSource) {
        SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
        sqlSessionFactoryBean.setDataSource(dataSource);
        org.apache.ibatis.session.Configuration configuration = new org.apache.ibatis.session.Configuration();
        configuration.setMapUnderscoreToCamelCase(true);
        configuration.setAutoMappingBehavior(AutoMappingBehavior.FULL);
        sqlSessionFactoryBean.setConfiguration(configuration);
        sqlSessionFactoryBean.setTypeAliasesPackage("cn.edu.tyut.entity");
        return sqlSessionFactoryBean;
    }

    /**
     * 使用 MapperScannerConfigurer 设置 Mapper 接口所在的包路径时，并不会直接将包下的类注册为 Bean。它的作用是告诉 Spring 在扫描指定包路径时要根据 Mapper 接口的规范来生成相应的 Bean。
     * 在 MyBatis 中，Mapper 接口并不是通过 @Component 或 @Bean 注解来进行注册，而是通过 MyBatis 的 MapperFactoryBean 来生成对应的代理类，并将其注册为 Bean。MapperFactoryBean 是 MyBatis 提供的一个 FactoryBean 实现类，它负责创建代理对象，并将其注册到 Spring 容器中。
     * MapperScannerConfigurer 类就是用来配置 MapperFactoryBean 的，它会将指定包路径下的 Mapper 接口转换成对应的 MapperFactoryBean，并将其注册为 Bean。这样，在其他地方使用 @Autowired 或 @Resource 注解时，就可以直接注入对应的 Mapper 接口的代理对象了。
     * 因此，使用 MapperScannerConfigurer 设置 Mapper 接口所在的包路径时，实际上是在配置 Spring 扫描 Mapper 接口并生成对应的 Bean 的规则。并不是直接将包下的类注册为 Bean，而是根据 Mapper 接口的规范通过 MapperFactoryBean 进行动态代理后注册为 Bean。
     * @return mapperScannerConfigurer
     */
//    @Bean
//    public MapperScannerConfigurer getMapperScannerConfigurer() {
//        MapperScannerConfigurer mapperScannerConfigurer = new MapperScannerConfigurer();
//        mapperScannerConfigurer.setBasePackage("cn.edu.tyut.wqt.mapper");
//        return mapperScannerConfigurer;
//    }
}