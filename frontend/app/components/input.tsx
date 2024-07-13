import React, { ComponentProps } from 'react'

interface InputProps extends ComponentProps<"input">{
    text: string
}

function Input(props:InputProps) {
  return (
    <>
        <label htmlFor="">{props.text}</label>
        <input {...props} className='bg-secondary shadow-md h-8'/>
    </>
  )
}

export default Input