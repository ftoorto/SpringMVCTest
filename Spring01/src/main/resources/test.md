# @Autowired
先byType后byName进行注入， 可与@Qualifier(value = ”beanid“)成对使用。
默认required属性为true ,当@Autowired(required = false)时，被修饰属性对应的bean可以不存在，此时该属性则初始化为null

# @Resource
通常与（name=”beanid“）一起搭配使用，等价于@Autowired @Qualifier(value=”beanid“)
# @Nullable
可以使用在方法上面，属性上面，参数上面，表示方法返回可以为空，属性值可以为空，参数值可以为空
# @Component
使用前需配置
`<context:component-scan base-package="***">
`

用在类上，表示此类被IOC容器管理，属性则有@Value注入，或者显示赋值。@Controller @Repository @Service 这四者功能一样

# @Scope
用在bean上指定作用域

# @Configuration
