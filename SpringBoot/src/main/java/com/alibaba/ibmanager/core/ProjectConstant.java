package com.alibaba.ibmanager.core;

/**
 * Created by wb-wyh270612 on 2017/8/28.
 *
 * @author wb-wyh270612
 * @date 2017/08/28
 */
public class ProjectConstant {
    public static final String BASE_DAL_PACKAGE = "com.alibaba.ibmanager.core";//项目基础包名称

    public static final String MODEL_PACKAGE = BASE_DAL_PACKAGE + ".model";//Model所在包
    public static final String MAPPER_PACKAGE = BASE_DAL_PACKAGE + ".dao";//Mapper所在包
    public static final String FACE_SERVICE_PACKAGE = "com.alibaba.ibmanager.core.service";//Service所在包
    public static final String FACE_SERVICE_IMPL_PACKAGE = "com.alibaba.ibmanager.core.service.impl";//ServiceImpl所在包
    public static final String FACE_CONTROLLER_PACKAGE = "com.alibaba.ibmanager.core.web";//Controller所在包

    public static final String MAPPER_INTERFACE_REFERENCE = "com.alibaba.ibmanager.core.Mapper";//Mapper插件基础接口的完全限定名
}
