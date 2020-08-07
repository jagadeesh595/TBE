package com.ns.tbe.Business;

import com.ns.tbe.model.*;
import com.ns.tbe.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.time.LocalDateTime;
import java.util.*;

@Service
public class DataLoader {
    @Autowired
    MemberRepository memberRepository;

    public boolean saveMember() {
        try {
            //region - create new Member = Rajesh ("TBE001")
            Member member = new Member();
            member.setMemberId("TBE001");
            member.setFirstName("Rajesh");
            member.setLastName("Last");
            member.setAddressTypeId(2);
            member.setDefaultAddress(true);
            member.setHomePhone("999,9999,999");
            member.setWorkPhone("944,4444,445");
            member.setCreatedDate(LocalDateTime.now());
            member.setCreatedBy(BigInteger.valueOf(1));
            member.setRowStatusId(1);

            memberRepository.save(member).block();
            //endregion

            //region - create new Member = Harish ("TBE002")
            Member member2 = new Member();
            member2.setMemberId("TBE002");
            member2.setFirstName("Harish");
            member2.setLastName("Last");
            member2.setAddressTypeId(2);
            member2.setDefaultAddress(true);
            member2.setHomePhone("999,9999,999");
            member2.setWorkPhone("944,4444,445");
            member2.setCreatedDate(LocalDateTime.now());
            member2.setCreatedBy(BigInteger.valueOf(1));
            member2.setRowStatusId(1);

            Member memberRajesh = memberRepository.findByMemberId("TBE001").block();

            Map<Member, MemberSponsor> memberMemberSponsor1 = new HashMap<>();

            MemberSponsor memberSponsor = new MemberSponsor();
            memberSponsor.setEnrolledDate(LocalDateTime.now());
            memberSponsor.setMemberStatusId(1);
            memberSponsor.setSalesCountry("USA");

            memberMemberSponsor1.put(memberRajesh, memberSponsor);
            member2.setHasSponsor(memberMemberSponsor1);

            Order order = new Order();
            order.setOrderNumber("ORD1001");
            order.setSalesCountryId(1);
            order.setTotalProductVolume(BigDecimal.valueOf(1.33));
            order.setTotalRetailPrice(BigDecimal.valueOf(200.00));
            member2.setHasOrders(Arrays.asList(order));

            Bonus bonus=new Bonus();
            bonus.setBusinessEntityId(1);
            bonus.setBeginningLevelId(1);
            bonus.setEndingLevelId(2);

            Map<Bonus, BonusPeriod> bonusBonusPeriodMap = new HashMap<>();
            BonusPeriod bonusPeriod=new BonusPeriod();
            bonusPeriod.setProcessingYear(2020);
            bonusPeriod.setProcessingMonth(7);
            bonusPeriod.setProcessingCycle(1);
            bonusBonusPeriodMap.put(bonus,bonusPeriod);
            member2.setHasBonus(bonusBonusPeriodMap);

            memberRepository.save(member2).block();
            //endregion

            //region - create new Member = Kiran ("TBE003")
            Member member3 = new Member();
            member3.setMemberId("TBE003");
            member3.setFirstName("Kiran");
            member3.setLastName("Last");
            member3.setAddressTypeId(3);
            member3.setDefaultAddress(true);
            member3.setHomePhone("999,9999,999");
            member3.setWorkPhone("944,4444,445");
            member3.setCreatedDate(LocalDateTime.now());
            member3.setCreatedBy(BigInteger.valueOf(1));
            member3.setRowStatusId(1);

            Member memberHarish = memberRepository.findByMemberId("TBE002").block();

            Map<Member, MemberSponsor> memberMemberSponsorMap = new HashMap<>();

            MemberSponsor memberSponsor1 = new MemberSponsor();
            memberSponsor1.setEnrolledDate(LocalDateTime.now());
            memberSponsor1.setMemberStatusId(1);
            memberSponsor1.setSalesCountry("USA");
            memberMemberSponsorMap.put(memberRajesh, memberSponsor1);

            MemberSponsor memberSponsor2 = new MemberSponsor();
            memberSponsor2.setEnrolledDate(LocalDateTime.of(2019, 3, 26, 10, 10));
            memberSponsor2.setMemberStatusId(1);
            memberSponsor2.setSalesCountry("GBR");
            memberMemberSponsorMap.put(memberHarish, memberSponsor2);

            member3.setHasSponsor(memberMemberSponsorMap);

            memberRepository.save(member3).block();
            //endregion

        } catch (Exception ex) {
            System.out.println(ex);
        }
        return true;
    }
}