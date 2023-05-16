package com.beiyuan.gateway.rpc;

import com.beiyuan.gateway.entity.Medicine;

public interface IActivity {
    String sayHi(String str);

    int getCount(Medicine medicine);

    String noArgs();
}
