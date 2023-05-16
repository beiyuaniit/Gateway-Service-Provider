package com.beiyuan.gateway.interfaces;

import com.beiyuan.gateway.entity.Medicine;
import com.beiyuan.gateway.rpc.IActivity;
import org.apache.dubbo.config.annotation.Service;


//通过dubbo提供
@Service(version = "1.0.0")
public class Activity implements IActivity {

    @Override
    public String sayHi(String str) {
        System.out.println("welcome "+ str);
        return "hi " + str + " by api-gateway-test-provider";
    }

    @Override
    public int getCount(Medicine medicine) {
        System.out.println(medicine);
        return 102;
    }

    @Override
    public String noArgs() {
        System.out.println("notArgs ....");
        return "noArgs";
    }

}
