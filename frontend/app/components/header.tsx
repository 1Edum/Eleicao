import Image from 'next/image'
import React from 'react'

function Header() {
  return (
    <div className='flex items-center justify-between px-5 bg-tertiary h-[12vh] gap-5 shadow-lg' >
        <div className='relative w-32 h-12'>
            <Image 
                src={"/logo.png"}
                alt='logo'
                fill
                className='cover'
                quality={100}
                priority
            />
        </div>
        <div className='bg-primary w-1 h-12'></div>
        <h4 className='text-xl w-32'>Eleição</h4>
    </div>
  )
}

export default Header