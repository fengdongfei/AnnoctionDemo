package com.example.feng.annoction;

/**
 * Created by Chexiangjia-MAC on 17/6/27.
 */

public interface TestApi {
    @Column(name = "1",setFuncName = "2",getFuncName = "3",defaultDBValue = true)
    interface T1{
    }
    @HostAnoy.NameSpace("ok")
    interface T2{

    }
    @HostAnoy.NameSpace(value = "ok",con = "4")
    interface T3{

    }
    @Table(tableName = "5")
    interface T4{

    }
}
