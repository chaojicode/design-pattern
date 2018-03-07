package com.chaojicode;

public class PerfectEngine implements Engine {
    private PerfectEngineAdapter adapter;
    @Override
    public void run(String type) {
        if ("real".equals(type)){
            System.out.println("完美引擎，点火启动");
        }else{
            adapter = new PerfectEngineAdapter();
            adapter.run(type);
        }
    }
}
