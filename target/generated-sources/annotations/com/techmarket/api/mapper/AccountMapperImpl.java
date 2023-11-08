package com.techmarket.api.mapper;

import com.techmarket.api.dto.account.AccountAutoCompleteDto;
import com.techmarket.api.dto.account.AccountDto;
import com.techmarket.api.form.user.SignUpUserForm;
import com.techmarket.api.form.user.UpdateMyprofile;
import com.techmarket.api.form.user.UpdateUserForm;
import com.techmarket.api.model.Account;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.processing.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2023-11-09T00:11:52+0700",
    comments = "version: 1.3.1.Final, compiler: javac, environment: Java 20.0.2 (Oracle Corporation)"
)
@Component
public class AccountMapperImpl implements AccountMapper {

    @Autowired
    private GroupMapper groupMapper;

    @Override
    public AccountDto fromAccountToDto(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountDto accountDto = new AccountDto();

        accountDto.setLastLogin( account.getLastLogin() );
        accountDto.setPhone( account.getPhone() );
        accountDto.setKind( account.getKind() );
        accountDto.setFullName( account.getFullName() );
        accountDto.setIsSuperAdmin( account.getIsSuperAdmin() );
        accountDto.setId( account.getId() );
        accountDto.setAvatar( account.getAvatarPath() );
        accountDto.setEmail( account.getEmail() );
        accountDto.setUsername( account.getUsername() );
        accountDto.setGroup( groupMapper.fromEntityToGroupDto( account.getGroup() ) );

        return accountDto;
    }

    @Override
    public AccountAutoCompleteDto fromAccountToAutoCompleteDto(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountAutoCompleteDto accountAutoCompleteDto = new AccountAutoCompleteDto();

        accountAutoCompleteDto.setAvatarPath( account.getAvatarPath() );
        accountAutoCompleteDto.setFullName( account.getFullName() );
        if ( account.getId() != null ) {
            accountAutoCompleteDto.setId( account.getId() );
        }

        return accountAutoCompleteDto;
    }

    @Override
    public List<AccountAutoCompleteDto> convertAccountToAutoCompleteDto(List<Account> list) {
        if ( list == null ) {
            return null;
        }

        List<AccountAutoCompleteDto> list1 = new ArrayList<AccountAutoCompleteDto>( list.size() );
        for ( Account account : list ) {
            list1.add( accountToAccountAutoCompleteDto( account ) );
        }

        return list1;
    }

    @Override
    public Account fromSignUpUserToAccount(SignUpUserForm signUpUserForm) {
        if ( signUpUserForm == null ) {
            return null;
        }

        Account account = new Account();

        account.setAvatarPath( signUpUserForm.getAvatarPath() );
        account.setFullName( signUpUserForm.getFullName() );
        account.setPhone( signUpUserForm.getPhone() );
        account.setEmail( signUpUserForm.getEmail() );

        return account;
    }

    @Override
    public void fromUpdateUserFormToEntity(UpdateUserForm updateUserForm, Account account) {
        if ( updateUserForm == null ) {
            return;
        }

        if ( updateUserForm.getAvatarPath() != null ) {
            account.setAvatarPath( updateUserForm.getAvatarPath() );
        }
        if ( updateUserForm.getFullName() != null ) {
            account.setFullName( updateUserForm.getFullName() );
        }
        if ( updateUserForm.getPhone() != null ) {
            account.setPhone( updateUserForm.getPhone() );
        }
        if ( updateUserForm.getEmail() != null ) {
            account.setEmail( updateUserForm.getEmail() );
        }
    }

    @Override
    public void fromUpdateMyProfileToEntity(UpdateMyprofile updateMyprofile, Account account) {
        if ( updateMyprofile == null ) {
            return;
        }

        if ( updateMyprofile.getAvatarPath() != null ) {
            account.setAvatarPath( updateMyprofile.getAvatarPath() );
        }
        if ( updateMyprofile.getFullName() != null ) {
            account.setFullName( updateMyprofile.getFullName() );
        }
        if ( updateMyprofile.getPhone() != null ) {
            account.setPhone( updateMyprofile.getPhone() );
        }
        if ( updateMyprofile.getEmail() != null ) {
            account.setEmail( updateMyprofile.getEmail() );
        }
    }

    protected AccountAutoCompleteDto accountToAccountAutoCompleteDto(Account account) {
        if ( account == null ) {
            return null;
        }

        AccountAutoCompleteDto accountAutoCompleteDto = new AccountAutoCompleteDto();

        if ( account.getId() != null ) {
            accountAutoCompleteDto.setId( account.getId() );
        }
        accountAutoCompleteDto.setFullName( account.getFullName() );
        accountAutoCompleteDto.setAvatarPath( account.getAvatarPath() );

        return accountAutoCompleteDto;
    }
}
