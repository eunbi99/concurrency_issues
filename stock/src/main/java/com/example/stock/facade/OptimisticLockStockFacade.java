package com.example.stock.facade;

import com.example.stock.servie.OptimisticLockStockService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class OptimisticLockStockFacade {
    private final OptimisticLockStockService optimisticLockStockService;

    public void decrease(Long id, Long quantity) throws InterruptedException {
        // optimistic Lock을 사용했을 때 업데이트에 실패하는 경우 재시도를 해야한다.
        while(true) {
            try {
                optimisticLockStockService.decrease(id,quantity);

                break;
            } catch (Exception e) {
                Thread.sleep(50);
            }
        }
    }
}
