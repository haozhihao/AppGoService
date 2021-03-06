package com.hzh.service.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.hzh.service.entity.DemoEntity;
import com.hzh.service.mapper.DemoMapper;
import com.hzh.service.service.IDemoService;
import org.springframework.stereotype.Service;

@Service
public class DemoServiceImpl extends ServiceImpl<DemoMapper, DemoEntity> implements IDemoService {

}
